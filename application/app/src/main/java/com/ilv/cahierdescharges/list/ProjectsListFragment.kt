package com.ilv.cahierdescharges.list

import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ilv.cahierdescharges.R
import com.ilv.cahierdescharges.databinding.ListBinding
import com.ilv.cahierdescharges.model.Project
import com.ilv.cahierdescharges.model.generateRandomProject

class ProjectsListFragment : Fragment(){

    private lateinit var binding : ListBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = ListBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.projectsList.layoutManager = LinearLayoutManager(requireContext())

        val projectsList = listOf(generateRandomProject(),
        generateRandomProject(),
        generateRandomProject(),
        generateRandomProject(),)

        binding.projectsList.adapter = Adapter(projects = projectsList)




        /*binding.button.setOnClickListener{
            findNavController().navigate(
                    ProjectsListFragmentDirections.actionProjectsListFragmentToProjectsDetailsFragment(
                            generateRandomProject()
                    )
            )
        }*/
    }
}

class Adapter(val projects: List<Project>) : RecyclerView.Adapter<ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_projects, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindProject(projects[position])
    }

    override fun getItemCount(): Int {
        return projects.size
    }

}

class ViewHolder(v: View): RecyclerView.ViewHolder(v){

    private val projectNameClient = itemView.findViewById<TextView>(R.id.card_name_client)
    private val projectTitle = itemView.findViewById<TextView>(R.id.card_title_project)
    private val projectMailClient = itemView.findViewById<TextView>(R.id.card_mail)
    private val projectDate = itemView.findViewById<TextView>(R.id.card_date)

    fun bindProject(project: Project) {
        projectNameClient.text = project.nomClient
        projectTitle.text = project.nomPojet
        projectMailClient.text = project.mail
        projectDate.text = project.dateSoumission
    }

}

