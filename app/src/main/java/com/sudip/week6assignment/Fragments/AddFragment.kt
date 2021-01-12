package com.sudip.week6assignment.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import com.sudip.week6assignment.R


class AddFragment : Fragment() {

    private lateinit var edtname: EditText
    private lateinit var edtage: EditText
    private lateinit var edtaddress: EditText
    private lateinit var rg: RadioGroup
    private lateinit var rdomale: RadioButton
    private lateinit var rdofemale: RadioButton
    private lateinit var rdoother: RadioButton
    private lateinit var btnsave:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add, container, false)
        edtname = view.findViewById(R.id.edtname)
        edtage = view.findViewById(R.id.edtage)
        edtaddress = view.findViewById(R.id.edtaddress)
        rg=view.findViewById(R.id.rg)
        rdomale=view.findViewById(R.id.rdomale)
        rdofemale=view.findViewById(R.id.rdofemale)
        rdoother=view.findViewById(R.id.rdoother)
        btnsave=view.findViewById(R.id.btnsave)

        return view
    }
}
