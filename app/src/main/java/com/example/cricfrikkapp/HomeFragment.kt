package com.example.cricfrikkapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.cricfrikkapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding



    private fun settingsClicked(view: View)
    {
        view.findNavController().navigate(R.id.action_homeFragment_to_settingFragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(inflater, R.layout.fragment_home, container, false)

        // Inflate the layout for this fragment
      //  return inflater.inflate(R.layout.fragment_home, container, false)

        binding.thread1.setOnClickListener {view:View->
            view.findNavController().navigate(R.id.action_homeFragment_to_threadFragment)

        }
        binding.thread2.setOnClickListener {view:View->
            view.findNavController().navigate(R.id.action_homeFragment_to_threadFragment)

        }
        binding.thread3.setOnClickListener {view:View->
            view.findNavController().navigate(R.id.action_homeFragment_to_threadFragment)

        }

        binding.thread4.setOnClickListener {view:View->
            view.findNavController().navigate(R.id.action_homeFragment_to_threadFragment)

        }

        return binding.root
    }

}