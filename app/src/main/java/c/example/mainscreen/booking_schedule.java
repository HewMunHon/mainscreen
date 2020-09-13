package c.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class booking_schedule extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private DatabaseReference mRefB;
    private HistoryAdapter adapter;
    private Booking booking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_schedule);

        mRecyclerView = (RecyclerView) findViewById(R.id.databook);


        booking =new Booking();
        mRefB = FirebaseDatabase.getInstance().getReference().child("Booking");


        mRefB.keepSynced(true);

        mRecyclerView=(RecyclerView) findViewById(R.id.databook);
        mRecyclerView.setHasFixedSize(false);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<Booking> option = new FirebaseRecyclerOptions.Builder<Booking>().setQuery(mRefB,Booking.class).setLifecycleOwner(this).build();


        adapter=new HistoryAdapter(option);

        mRecyclerView.setAdapter(adapter);


    }
}