package com.example.periodictable

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController


class PeriodicTable : Fragment() {

    private val elements = listOf(
        // Period 1
        Element(1, 1, "H", "Hydrogen", R.color.hydrogen_color, 1.008, 1, 1, "s", "stable"),
        Element(2, 0, "", "", R.color.transparent, 0.0, 1, 2, "", ""),
        Element(3, 0, "", "", R.color.transparent, 0.0, 1, 3, "", ""),
        Element(4, 0, "", "", R.color.transparent, 0.0, 1, 4, "", ""),
        Element(5, 0, "", "", R.color.transparent, 0.0, 1, 5, "", ""),
        Element(6, 0, "", "", R.color.transparent, 0.0, 1, 6, "", ""),
        Element(7, 0, "", "", R.color.transparent, 0.0, 1, 7, "", ""),
        Element(8, 0, "", "", R.color.transparent, 0.0, 1, 8, "", ""),
        Element(9, 0, "", "", R.color.transparent, 0.0, 1, 9, "", ""),
        Element(10, 0, "", "", R.color.transparent, 0.0, 1, 10, "", ""),
        Element(11, 0, "", "", R.color.transparent, 0.0, 1, 11, "", ""),
        Element(12, 0, "", "", R.color.transparent, 0.0, 1, 12, "", ""),
        Element(13, 0, "", "", R.color.transparent, 0.0, 1, 13, "", ""),
        Element(14, 0, "", "", R.color.transparent, 0.0, 1, 14, "", ""),
        Element(15, 0, "", "", R.color.transparent, 0.0, 1, 15, "", ""),
        Element(16, 0, "", "", R.color.transparent, 0.0, 1, 16, "", ""),
        Element(17, 0, "", "", R.color.transparent, 0.0, 1, 17, "", ""),
        Element(18, 2, "He", "Helium", R.color.noble_gas_color, 4.0026, 1, 18, "p", "stable"),

// Period 2
        Element(19, 3, "Li", "Lithium", R.color.alkali_metal_color, 6.94, 2, 1, "s", "stable"),
        Element(20, 4, "Be", "Beryllium", R.color.alkaline_earth_metal_color, 9.0122, 2, 2, "s", "stable"),
        Element(21, 0, "", "", R.color.transparent, 0.00, 2, 3, "", ""),
        Element(22, 0, "", "", R.color.transparent, 0.00, 2, 4, "", ""),
        Element(23, 0, "", "", R.color.transparent, 0.00, 2, 5, "", ""),
        Element(24, 0, "", "", R.color.transparent, 0.00, 2, 6, "", ""),
        Element(25, 0, "", "", R.color.transparent, 0.00, 2, 7, "", ""),
        Element(26, 0, "", "", R.color.transparent, 0.00, 2, 8, "", ""),
        Element(27, 0, "", "", R.color.transparent, 0.00, 2, 9, "", ""),
        Element(28, 0, "", "", R.color.transparent, 0.00, 2, 10, "", ""),
        Element(29, 0, "", "", R.color.transparent, 0.00, 2, 11, "", ""),
        Element(30, 0, "", "", R.color.transparent, 0.00, 2, 12, "", ""),
        Element(31, 5, "B", "Boron", R.color.metalloid_color, 10.81, 2, 13, "p", "stable"),
        Element(32, 6, "C", "Carbon", R.color.nonmetal_color, 12.011, 2, 14, "p", "stable"),
        Element(33, 7, "N", "Nitrogen", R.color.nonmetal_color, 14.007, 2, 15, "p", "stable"),
        Element(34, 8, "O", "Oxygen", R.color.nonmetal_color, 15.999, 2, 16, "p", "stable"),
        Element(35, 9, "F", "Fluorine", R.color.halogen_color, 18.998, 2, 17, "p", "stable"),
        Element(36, 10, "Ne", "Neon", R.color.noble_gas_color, 20.180, 2, 18, "p", "stable"),

// Period 3
        Element(37, 11, "Na", "Sodium", R.color.alkali_metal_color, 22.990, 3, 1, "s", "stable"),
        Element(38, 12, "Mg", "Magnesium", R.color.alkaline_earth_metal_color, 24.305, 3, 2, "s", "stable"),
        Element(39, 0, "", "", R.color.transparent, 0.00, 3, 3, "", ""),
        Element(40, 0, "", "", R.color.transparent, 0.00, 3, 4, "", ""),
        Element(41, 0, "", "", R.color.transparent, 0.00, 3, 5, "", ""),
        Element(42, 0, "", "", R.color.transparent, 0.00, 3, 6, "", ""),
        Element(43, 0, "", "", R.color.transparent, 0.00, 3, 7, "", ""),
        Element(44, 0, "", "", R.color.transparent, 0.00, 3, 8, "", ""),
        Element(45, 0, "", "", R.color.transparent, 0.00, 3, 9, "", ""),
        Element(46, 0, "", "", R.color.transparent, 0.00, 3, 10, "", ""),
        Element(47, 0, "", "", R.color.transparent, 0.00, 3, 11, "", ""),
        Element(48, 0, "", "", R.color.transparent, 0.00, 3, 12, "", ""),
        Element(49, 13, "Al", "Aluminum", R.color.post_transition_metal_color, 26.982, 3, 13, "p", "stable"),
        Element(50, 14, "Si", "Silicon", R.color.metalloid_color, 28.085, 3, 14, "p", "stable"),
        Element(51, 15, "P", "Phosphorus", R.color.nonmetal_color, 30.974, 3, 15, "p", "stable"),
        Element(52, 16, "S", "Sulfur", R.color.nonmetal_color, 32.06, 3, 16, "p", "stable"),
        Element(53, 17, "Cl", "Chlorine", R.color.halogen_color, 35.45, 3, 17, "p", "stable"),
        Element(54, 18, "Ar", "Argon", R.color.noble_gas_color, 39.948, 3, 18, "p", "stable"),

// Period 4
        Element(55, 19, "K", "Potassium", R.color.alkali_metal_color, 39.098, 4, 1, "s", "stable"),
        Element(56, 20, "Ca", "Calcium", R.color.alkaline_earth_metal_color, 40.078, 4, 2, "s", "stable"),
        Element(57, 21, "Sc", "Scandium", R.color.transition_metal_color, 44.956, 4, 3, "d", "stable"),
        Element(58, 22, "Ti", "Titanium", R.color.transition_metal_color, 47.867, 4, 4, "d", "stable"),
        Element(59, 23, "V", "Vanadium", R.color.transition_metal_color, 50.942, 4, 5, "d", "stable"),
        Element(60, 24, "Cr", "Chromium", R.color.transition_metal_color, 52.00, 4, 6, "d", "stable"),
        Element(61, 25, "Mn", "Manganese", R.color.transition_metal_color, 54.938, 4, 7, "d", "stable"),
        Element(62, 26, "Fe", "Iron", R.color.transition_metal_color, 55.845, 4, 8, "d", "stable"),
        Element(63, 27, "Co", "Cobalt", R.color.transition_metal_color, 58.933, 4, 9, "d", "stable"),
        Element(64, 28, "Ni", "Nickel", R.color.transition_metal_color, 58.693, 4, 10, "d", "stable"),
        Element(65, 29, "Cu", "Copper", R.color.transition_metal_color, 63.546, 4, 11, "d", "stable"),
        Element(66, 30, "Zn", "Zinc", R.color.transition_metal_color, 65.38, 4, 12, "d", "stable"),
        Element(67, 31, "Ga", "Gallium", R.color.post_transition_metal_color, 69.723, 4, 13, "p", "stable"),
        Element(68, 32, "Ge", "Germanium", R.color.metalloid_color, 72.63, 4, 14, "p", "stable"),
        Element(69, 33, "As", "Arsenic", R.color.metalloid_color, 74.922, 4, 15, "p", "stable"),
        Element(70, 34, "Se", "Selenium", R.color.nonmetal_color, 78.971, 4, 16, "p", "stable"),
        Element(71, 35, "Br", "Bromine", R.color.halogen_color, 79.904, 4, 17, "p", "stable"),
        Element(72, 36, "Kr", "Krypton", R.color.noble_gas_color, 83.798, 4, 18, "p", "stable"),

// Period 5
        Element(73, 37, "Rb", "Rubidium", R.color.alkali_metal_color, 85.468, 5, 1, "s", "stable"),
        Element(74, 38, "Sr", "Strontium", R.color.alkaline_earth_metal_color, 87.62, 5, 2, "s", "stable"),
        Element(75, 39, "Y", "Yttrium", R.color.transition_metal_color, 88.905, 5, 3, "d", "stable"),
        Element(76, 40, "Zr", "Zirconium", R.color.transition_metal_color, 91.224, 5, 4, "d", "stable"),
        Element(77, 41, "Nb", "Niobium", R.color.transition_metal_color, 92.906, 5, 5, "d", "stable"),
        Element(78, 42, "Mo", "Molybdenum", R.color.transition_metal_color, 95.95, 5, 6, "d", "stable"),
        Element(79, 43, "Tc", "Technetium", R.color.transition_metal_color, 98.0, 5, 7, "d", "radioactive"),
        Element(80, 44, "Ru", "Ruthenium", R.color.transition_metal_color, 101.07, 5, 8, "d", "stable"),
        Element(81, 45, "Rh", "Rhodium", R.color.transition_metal_color, 102.91, 5, 9, "d", "stable"),
        Element(82, 46, "Pd", "Palladium", R.color.transition_metal_color, 106.42, 5, 10, "d", "stable"),
        Element(83, 47, "Ag", "Silver", R.color.transition_metal_color, 107.87, 5, 11, "d", "stable"),
        Element(84, 48, "Cd", "Cadmium", R.color.transition_metal_color, 112.41, 5, 12, "d", "stable"),
        Element(85, 49, "In", "Indium", R.color.post_transition_metal_color, 114.82, 5, 13, "p", "stable"),
        Element(86, 50, "Sn", "Tin", R.color.post_transition_metal_color, 118.71, 5, 14, "p", "stable"),
        Element(87, 51, "Sb", "Antimony", R.color.metalloid_color, 121.76, 5, 15, "p", "stable"),
        Element(88, 52, "Te", "Tellurium", R.color.metalloid_color, 127.60, 5, 16, "p", "stable"),
        Element(89, 53, "I", "Iodine", R.color.halogen_color, 126.90, 5, 17, "p", "stable"),
        Element(90, 54, "Xe", "Xenon", R.color.noble_gas_color, 131.29, 5, 18, "p", "stable"),

// Period 6
        Element(91, 55, "Cs", "Cesium", R.color.alkali_metal_color, 132.905, 6, 1, "s", "stable"),
        Element(92, 56, "Ba", "Barium", R.color.alkaline_earth_metal_color, 137.33, 6, 2, "s", "stable"),
// Lanthanides (omitted for simplicity, but you can add them similarly)
        Element(93, 57, "La", "Lanthanum", R.color.lanthanide_color, 138.905, 6, 3, "f", "stable"),
// ... (other lanthanides can be added in the main table if desired)
        Element(94, 72, "Hf", "Hafnium", R.color.transition_metal_color, 178.49, 6, 4, "d", "stable"),
        Element(95, 73, "Ta", "Tantalum", R.color.transition_metal_color, 180.947, 6, 5, "d", "stable"),
        Element(96, 74, "W", "Tungsten", R.color.transition_metal_color, 183.84, 6, 6, "d", "stable"),
        Element(97, 75, "Re", "Rhenium", R.color.transition_metal_color, 186.207, 6, 7, "d", "stable"),
        Element(98, 76, "Os", "Osmium", R.color.transition_metal_color, 190.23, 6, 8, "d", "stable"),
        Element(99, 77, "Ir", "Iridium", R.color.transition_metal_color, 192.217, 6, 9, "d", "stable"),
        Element(100, 78, "Pt", "Platinum", R.color.transition_metal_color, 195.084, 6, 10, "d", "stable"),
        Element(101, 79, "Au", "Gold", R.color.transition_metal_color, 196.967, 6, 11, "d", "stable"),
        Element(102, 80, "Hg", "Mercury", R.color.transition_metal_color, 200.592, 6, 12, "d", "stable"),
        Element(103, 81, "Tl", "Thallium", R.color.post_transition_metal_color, 204.38, 6, 13, "p", "stable"),
        Element(104, 82, "Pb", "Lead", R.color.post_transition_metal_color, 207.2, 6, 14, "p", "stable"),
        Element(105, 83, "Bi", "Bismuth", R.color.post_transition_metal_color, 208.980, 6, 15, "p", "stable"),
        Element(106, 84, "Po", "Polonium", R.color.metalloid_color, 209.982, 6, 16, "p", "radioactive"),
        Element(107, 85, "At", "Astatine", R.color.halogen_color, 210.0, 6, 17, "p", "radioactive"),
        Element(108, 86, "Rn", "Radon", R.color.noble_gas_color, 222.0, 6, 18, "p", "radioactive"),

// Period 7
        Element(109, 87, "Fr", "Francium", R.color.alkali_metal_color, 223.0, 7, 1, "s", "radioactive"),
        Element(110, 88, "Ra", "Radium", R.color.alkaline_earth_metal_color, 226.0, 7, 2, "s", "radioactive"),
// Actinides (omitted for simplicity, but you can add them similarly)
        Element(111, 89, "Ac", "Actinium", R.color.actinide_color, 227.0, 7, 3, "f", "radioactive"),
// ... (other actinides)
        Element(112, 104, "Rf", "Rutherfordium", R.color.transition_metal_color, 261.0, 7, 4, "d", "radioactive"),
        Element(113, 105, "Db", "Dubnium", R.color.transition_metal_color, 262.0, 7, 5, "d", "radioactive"),
        Element(114, 106, "Sg", "Seaborgium", R.color.transition_metal_color, 266.0, 7, 6, "d", "radioactive"),
        Element(115, 107, "Bh", "Bohrium", R.color.transition_metal_color, 270.0, 7, 7, "d", "radioactive"),
        Element(116, 108, "Hs", "Hassium", R.color.transition_metal_color, 277.0, 7, 8, "d", "radioactive"),
        Element(117, 109, "Mt", "Meitnerium", R.color.transition_metal_color, 276.0, 7, 9, "d", "radioactive"),
        Element(118, 110, "Ds", "Darmstadtium", R.color.transition_metal_color, 281.0, 7, 10, "d", "radioactive"),
        Element(119, 111, "Rg", "Roentgenium", R.color.transition_metal_color, 280.0, 7, 11, "d", "radioactive"),
        Element(120, 112, "Cn", "Copernicium", R.color.transition_metal_color, 285.0, 7, 12, "d", "radioactive"),
        Element(121, 113, "Nh", "Nihonium", R.color.post_transition_metal_color, 284.0, 7, 13, "p", "radioactive"),
        Element(122, 114, "Fl", "Flerovium", R.color.post_transition_metal_color, 289.0, 7, 14, "p", "radioactive"),
        Element(123, 115, "Mc", "Moscovium", R.color.post_transition_metal_color, 288.0, 7, 15, "p", "radioactive"),
        Element(124, 116, "Lv", "Livermorium", R.color.post_transition_metal_color, 293.0, 7, 16, "p", "radioactive"),
        Element(125, 117, "Ts", "Tennessine", R.color.halogen_color, 294.0, 7, 17, "p", "radioactive"),
        Element(126, 118, "Og", "Oganesson", R.color.noble_gas_color, 294.0, 7, 18, "p", "radioactive"),

    // blank lines
        Element(180, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(180, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(180, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(180, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(180, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(180, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(180, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // BlankElement(180, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(180, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(180, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(180, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(180, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(180, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(180, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(180, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(180, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(180, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(180, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(180, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank

// Lanthanoid series
        Element(144, 0, "", "", R.color.transparent, 0.0, 0, 0, "", ""), // Blank
        Element(145, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(146, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(147, 58, "Ce", "Cerium", R.color.lanthanide_color, 140.116, 6, 1, "f", "stable"),
        Element(148, 59, "Pr", "Praseodymium", R.color.lanthanide_color, 140.907, 6, 2, "f", "stable"),
        Element(149, 60, "Nd", "Neodymium", R.color.lanthanide_color, 144.242, 6, 3, "f", "stable"),
        Element(150, 61, "Pm", "Promethium", R.color.lanthanide_color, 145.0, 6, 4, "f", "radioactive"),
        Element(151, 62, "Sm", "Samarium", R.color.lanthanide_color, 150.36, 6, 5, "f", "stable"),
        Element(152, 63, "Eu", "Europium", R.color.lanthanide_color, 151.964, 6, 6, "f", "stable"),
        Element(153, 64, "Gd", "Gadolinium", R.color.lanthanide_color, 157.25, 6, 7, "f", "stable"),
        Element(154, 65, "Tb", "Terbium", R.color.lanthanide_color, 158.925, 6, 8, "f", "stable"),
        Element(155, 66, "Dy", "Dysprosium", R.color.lanthanide_color, 162.5, 6, 9, "f", "stable"),
        Element(156, 67, "Ho", "Holmium", R.color.lanthanide_color, 164.930, 6, 10, "f", "stable"),
        Element(157, 68, "Er", "Erbium", R.color.lanthanide_color, 167.259, 6, 11, "f", "stable"),
        Element(158, 69, "Tm", "Thulium", R.color.lanthanide_color, 168.934, 6, 12, "f", "stable"),
        Element(159, 70, "Yb", "Ytterbium", R.color.lanthanide_color, 173.04, 6, 13, "f", "stable"),
        Element(160, 71, "Lu", "Lutetium", R.color.lanthanide_color, 175.0, 6, 14, "f", "stable"),
        Element(161, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank

// Actinoid series
        Element(162, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(163, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(164, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(165, 90, "Th", "Thorium", R.color.actinide_color, 232.038, 7, 1, "f", "radioactive"),
        Element(166, 91, "Pa", "Protactinium", R.color.actinide_color, 231.036, 7, 2, "f", "radioactive"),
        Element(167, 92, "U", "Uranium", R.color.actinide_color, 238.028, 7, 3, "f", "radioactive"),
        Element(168, 93, "Np", "Neptunium", R.color.actinide_color, 237.048, 7, 4, "f", "radioactive"),
        Element(169, 94, "Pu", "Plutonium", R.color.actinide_color, 244.0, 7, 5, "f", "radioactive"),
        Element(170, 95, "Am", "Americium", R.color.actinide_color, 243.0, 7, 6, "f", "radioactive"),
        Element(171, 96, "Cm", "Curium", R.color.actinide_color, 247.0, 7, 7, "f", "radioactive"),
        Element(172, 97, "Bk", "Berkelium", R.color.actinide_color, 247.0, 7, 8, "f", "radioactive"),
        Element(173, 98, "Cf", "Californium", R.color.actinide_color, 251.0, 7, 9, "f", "radioactive"),
        Element(174, 99, "Es", "Einsteinium", R.color.actinide_color, 252.0, 7, 10, "f", "radioactive"),
        Element(175, 100, "Fm", "Fermium", R.color.actinide_color, 257.0, 7, 11, "f", "radioactive"),
        Element(176, 101, "Md", "Mendelevium", R.color.actinide_color, 258.0, 7, 12, "f", "radioactive"),
        Element(177, 102, "No", "Nobelium", R.color.actinide_color, 259.0, 7, 13, "f", "radioactive"),
        Element(178, 103, "Lr", "Lawrencium", R.color.actinide_color, 262.0, 7, 14, "f", "radioactive"),
        Element(179, 0, "", "", R.color.transparent, 0.00, 0, 0, "", ""), // Blank
        Element(180, 0, "", "", R.color.transparent, 0.00, 0, 0, "", "") // Blank

    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_periodic_table, container, false)

        setupGrid(view)

        return view
    }

    // Setup Grid
    private fun setupGrid(view: View) {
        val gridLayout: GridLayout = view.findViewById(R.id.gridLayout)

        val cardWidth = 210
        val cardHeight = 210


        for (element in elements) {
            val cardView = createElementCard(element, cardWidth, cardHeight)
            gridLayout.addView(cardView)
        }

    }


    // Create Card
    private fun createElementCard(element: Element, cardWidth: Int, cardHeight: Int): CardView {
        val cardView = CardView(requireContext()).apply {
            layoutParams = GridLayout.LayoutParams().apply {
                width = cardWidth
                height = cardHeight
                setMargins(8, 8, 8, 8)
            }
            radius = 8f
            setCardBackgroundColor(ContextCompat.getColor(requireContext(), element.categoryColor))
            // Make the card invisible if there's no symbol
            visibility = if (element.symbol.isBlank()) View.INVISIBLE else View.VISIBLE
        }

        // Only add content and click listener for non-blank elements
        if (element.symbol.isNotBlank()) {
            val linearLayout = LinearLayout(requireContext()).apply {
                orientation = LinearLayout.VERTICAL
                gravity = Gravity.CENTER
                setPadding(16, 16, 16, 16)
            }

            val atomicNumberText = TextView(requireContext()).apply {
                text = element.atomicNumber.toString()
                setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f)
                setTextColor(Color.WHITE)
            }

            val symbolText = TextView(requireContext()).apply {
                text = element.symbol
                setTextSize(TypedValue.COMPLEX_UNIT_SP, 18f)
                setTypeface(null, Typeface.BOLD)
                setTextColor(Color.WHITE)
            }

            val nameText = TextView(requireContext()).apply {
                text = element.name
                setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f)
                setTextColor(Color.WHITE)
            }

            linearLayout.addView(atomicNumberText)
            linearLayout.addView(symbolText)
            linearLayout.addView(nameText)
            cardView.addView(linearLayout)


            // Only add click listener for non-blank cards
            cardView.setOnClickListener {
                val action = PeriodicTableDirections.actionPeriodicTableToElementDetails(element)
                findNavController().navigate(action)
            }
        } else {
            // Ensure blank cards are not clickable
            cardView.isClickable = false
        }

        return cardView
    }
}