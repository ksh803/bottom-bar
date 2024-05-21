package com.example.bottom_bar.ui.file;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.bottom_bar.databinding.FragmentFileBinding;

public class FileFragment extends Fragment {

    private FragmentFileBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FileViewModel fileViewModel =
                new ViewModelProvider(this).get(FileViewModel.class);

        binding = FragmentFileBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textFile;
        fileViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}