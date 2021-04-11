package com.example.cricfrikkapp

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
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


        binding.group1.setOnClickListener{
            it->it.findNavController().navigate(R.id.action_homeFragment_to_cricgroupFragment)
        }

        binding.group2.setOnClickListener{
                it->it.findNavController().navigate(R.id.action_homeFragment_to_cricgroupFragment)
        }

        binding.group3.setOnClickListener{
                it->it.findNavController().navigate(R.id.action_homeFragment_to_cricgroupFragment)
        }

        binding.group4.setOnClickListener{
                it->it.findNavController().navigate(R.id.action_homeFragment_to_cricgroupFragment)
        }

        binding.group5.setOnClickListener{
                it->it.findNavController().navigate(R.id.action_homeFragment_to_cricgroupFragment)
        }

        binding.group6.setOnClickListener{
                it->it.findNavController().navigate(R.id.action_homeFragment_to_cricgroupFragment)
        }
        binding.group7.setOnClickListener{
                it->it.findNavController().navigate(R.id.action_homeFragment_to_cricgroupFragment)
        }
        binding.group8.setOnClickListener{
                it->it.findNavController().navigate(R.id.action_homeFragment_to_cricgroupFragment)
        }

        setHasOptionsMenu(true)


        return binding.root
    }



    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_design, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return NavigationUI.
        onNavDestinationSelected(item,requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }

}