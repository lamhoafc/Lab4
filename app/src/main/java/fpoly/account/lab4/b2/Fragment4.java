package fpoly.account.lab4.b2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import fpoly.account.lab4.R;
import fpoly.account.lab4.b1.Fragment1;

public class Fragment4 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_4, container, false);

        EditText edtInput = view.findViewById(R.id.edtInput);
        Button btnSend = view.findViewById(R.id.btnSend);

        btnSend.setOnClickListener(v -> {
            String data = edtInput.getText().toString();

            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            Fragment3 fragment3 = (Fragment3) fragmentManager.findFragmentById(R.id.fragment1_container);

            fragment3.txtKetQua.setText(data);
        });

        return view;
    }
}