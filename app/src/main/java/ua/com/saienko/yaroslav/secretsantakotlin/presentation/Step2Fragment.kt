package ua.com.saienko.yaroslav.secretsantakotlin.presentation

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import ua.com.saienko.yaroslav.secretsantakotlin.AppSanta
import ua.com.saienko.yaroslav.secretsantakotlin.databinding.FragmentStep2Binding
import ua.com.saienko.yaroslav.secretsantakotlin.presentation.adapters.NamesAdapter
import java.lang.RuntimeException
import javax.inject.Inject

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "Name"

/**
 * A simple [Fragment] subclass.
 * Use the [Step2Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Step2Fragment : Fragment() {

    private val component by lazy {
        (requireActivity().application as AppSanta).component
    }
    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(
            this,
            viewModelFactory
        )[Step1ViewModel::class.java] }

    private var _binding: FragmentStep2Binding? = null
    private val binding: FragmentStep2Binding
        get() = _binding ?: throw RuntimeException("FragmentStep2Binding == null")

    // TODO: Rename and change types of parameters
    lateinit var param1: String

    override fun onAttach(context: Context) {
        component.inject(this)
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1) ?: "XYI"
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        _binding = FragmentStep2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.initLd(param1)
//        val listNames =
//            viewModel.getTransformStringToList(param1)
//        for (name in listNames) {
//            Log.d("Step2Fragment", "$name")
//        }
        val adapter = NamesAdapter()
        binding.recyclerViewNames.adapter = adapter
        viewModel.ld.observe(viewLifecycleOwner){
            adapter.submitList(it)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Step2Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic fun newInstance(param1: String) =
                Step2Fragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                    }
                }
    }
}