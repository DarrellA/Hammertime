package net.aucutt.hammertime;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.internal.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SecondFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match


    public SecondFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
         final Context contextThemeWrapper = new ContextThemeWrapper(getActivity(), R.style.TransTheme);
//       // LayoutInflater cloneInflator = inflater.cloneInContext(contextThemeWrapper);
         Resources.Theme theme  = contextThemeWrapper.getTheme();
      //  theme.getResources()
         LayoutInflater cloneInflator = inflater.cloneInContext(contextThemeWrapper);
        getActivity().getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
         getActivity().getWindow().setStatusBarColor(Color.TRANSPARENT );
        //return cloneInflator.inflate(R.layout.fragment_second, container, false);
        return inflater.inflate(R.layout.fragment_second, container, false); // takes parent theme
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = (TextView) getActivity().findViewById(R.id.yourText);
        textView.append( " "  +   getActivity().getWindow().getStatusBarColor() );
        final Context contextThemeWrapper = new ContextThemeWrapper(getActivity(), R.style.TransTheme);
       // contextThemeWrapper.
    }



}
