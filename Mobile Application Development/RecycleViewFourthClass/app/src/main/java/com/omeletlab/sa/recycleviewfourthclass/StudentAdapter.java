package com.omeletlab.sa.recycleviewfourthclass;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by akashs on 6/22/16.
 */
public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {

    private List<Student> students;

    public StudentAdapter(List<Student> students) {
        this.students = students;
    }

    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        StudentViewHolder sv = new StudentViewHolder(v);

        return sv;
    }

    @Override
    public void onBindViewHolder(StudentViewHolder holder, int position) {
        holder.nameTV.setText(students.get(position).getStudentName());
        holder.idTV.setText(students.get(position).getStudentID());

    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public static class StudentViewHolder extends RecyclerView.ViewHolder{

        CardView cv;
        TextView nameTV;
        TextView idTV;

        public StudentViewHolder(View itemView) {
            super(itemView);

            cv = (CardView) itemView.findViewById(R.id.cv);
            nameTV = (TextView) itemView.findViewById(R.id.nameTV);
            idTV = (TextView) itemView.findViewById(R.id.idTV);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.context, ""+getAdapterPosition(), Toast.LENGTH_LONG).show();
                }
            });

        }
    }
}
