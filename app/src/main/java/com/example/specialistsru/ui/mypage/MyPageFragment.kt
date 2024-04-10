package com.example.specialistsru.ui.mypage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.specialistsru.MainActivity
import com.example.specialistsru.databinding.FragmentMyPageBinding
import com.vk.api.sdk.VK
import com.vk.api.sdk.auth.VKAuthenticationResult

class MyPageFragment : Fragment() {

    private var _binding: FragmentMyPageBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        val homeViewModel =
//            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentMyPageBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.headerSecondMyPage
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }

        val authLauncher = VK.login(requireActivity()) { result : VKAuthenticationResult ->
            when (result) {
                is VKAuthenticationResult.Success -> {
                    // User passed authorization
                }
                is VKAuthenticationResult.Failed -> {
                    // User didn't pass authorization
                }
            }
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}