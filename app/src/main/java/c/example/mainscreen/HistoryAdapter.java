package c.example.mainscreen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class HistoryAdapter extends FirebaseRecyclerAdapter<Booking,HistoryAdapter.viewHolder> {

    public HistoryAdapter(@NonNull FirebaseRecyclerOptions<Booking> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull viewHolder holder, int position, @NonNull Booking model) {
        holder. mTime.setText(model.getTime());
        holder.mDate.setText(model.getDate());
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bookinghistoryitem,parent,false);
        return new viewHolder(view);
    }


    public class viewHolder extends RecyclerView.ViewHolder {
        private TextView mDate,mTime,mName,mNote,mAddress,mPhone,mPayment;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            mDate=(TextView) itemView.findViewById(R.id.BDate);
            mTime=(TextView) itemView.findViewById(R.id.BTime);
        }
    }
}
