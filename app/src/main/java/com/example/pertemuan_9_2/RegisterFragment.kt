package com.example.pertemuan_9_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RegisterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegisterFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentRegister = inflater.inflate(R.layout.fragment_register, container, false)
        val btnRegister = fragmentRegister.findViewById<Button>(R.id.btn_to_login_tab)
        val username = fragmentRegister.findViewById<EditText>(R.id.regis_username)
        val email = fragmentRegister.findViewById<EditText>(R.id.regis_email)
        val phone = fragmentRegister.findViewById<EditText>(R.id.regis_phone)
        val password = fragmentRegister.findViewById<EditText>(R.id.regis_password)

        btnRegister.setOnClickListener{
            MainActivity.EXTRA_USERNAME = username.text.toString()
            MainActivity.EXTRA_EMAIL = email.text.toString()
            MainActivity.EXTRA_PHONE = phone.text.toString()
            MainActivity.EXTRA_PASSWORD = password.text.toString()
            var abc = MainActivity.EXTRA_USERNAME
            var def = MainActivity.EXTRA_PASSWORD
            username.setText("")
            email.setText("")
            phone.setText("")
            password.setText("")
            Toast.makeText(activity, "Berhasil Menyimpan data $abc dan $def", Toast.LENGTH_SHORT).show()
        }
        return fragmentRegister
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment RegisterFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RegisterFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}