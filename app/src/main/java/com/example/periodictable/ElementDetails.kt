package com.example.periodictable

import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.navArgs
import com.example.periodictable.databinding.FragmentElementDetailsBinding


class ElementDetails : Fragment(R.layout.fragment_element_details) {

    private val args: ElementDetailsArgs by navArgs()

    private var _binding: FragmentElementDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentElementDetailsBinding.bind(view)

        val element = args.element

        val elementColorInt = ContextCompat.getColor(requireContext(), element.categoryColor)

        val drawable = binding.elementColor.background
        if (drawable is GradientDrawable) {
            drawable.setColor(elementColorInt)
        }

        binding.elementCard.strokeColor = elementColorInt

        binding.atomicNumberTextView.text = element.atomicNumber.toString()
        binding.atomicSymbolTextView.text = element.symbol
        binding.symbolTextView.text = element.symbol
        binding.nameTextView.text = element.name
        binding.atomicWeightTextView.text = "Atomic Weight: ${element.atomicMass}"
        binding.periodGroupTextView.text = "Period: ${element.period}, Group: ${element.group}"
        binding.blockTextView.text = "Block: ${element.block}"
        binding.radioactivityTextView.text = "Radioactivity: ${element.stability}"

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}