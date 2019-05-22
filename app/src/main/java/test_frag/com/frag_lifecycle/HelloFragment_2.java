package test_frag.com.frag_lifecycle;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class HelloFragment_2 extends Fragment {


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Toast.makeText(getActivity(), "onAttach Frag 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(), "onCreate Frag 2", Toast.LENGTH_SHORT).show();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /** Inflating the layout for this fragment **/
        View v = inflater.inflate(R.layout.activity_frag_2, null);
        Toast.makeText(getActivity(), "onCreateView Frag 2", Toast.LENGTH_SHORT).show();
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Toast.makeText(getActivity(), "onViewCreated Frag 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Toast.makeText(getActivity(), "onActivityCreated Frag 2", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);

        Toast.makeText(getActivity(), "onViewStateRestored Frag 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();

        Toast.makeText(getActivity(), "onStart Frag 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();

        Toast.makeText(getActivity(), "onResume Frag 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();

        Toast.makeText(getActivity(), "onPause Frag 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();

        Toast.makeText(getActivity(), "onStop Frag 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        Toast.makeText(getActivity(), "onDestroyView Frag 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Toast.makeText(getActivity(), "onDestroy Frag 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();

        Toast.makeText(getActivity(), "onDetach Frag 2", Toast.LENGTH_SHORT).show();
    }
}
