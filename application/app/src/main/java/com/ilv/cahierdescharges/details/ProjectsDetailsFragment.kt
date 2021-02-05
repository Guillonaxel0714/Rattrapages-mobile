package com.ilv.cahierdescharges.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ilv.cahierdescharges.databinding.DetailsBinding
import com.ilv.cahierdescharges.model.generateRandomProject


class ProjectsDetailsFragment : Fragment(){

    private lateinit var binding : DetailsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DetailsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(generateRandomProject()){
            binding.valueNameProject.text = nomPojet
            binding.valueTypeSite.text = TypeSite
            binding.valueObjectifs.text = objectifs
            binding.valueDateDebut.text = datesDebut
            binding.valueDateFin.text = datesFin
            binding.valueFonction.text = fonctionnalite
            binding.valueBesoinsPrecis.text = precisionBesoins
            binding.valuePages.text = pages
            binding.valueCreation.text = creation.toString()
        }

    }
}