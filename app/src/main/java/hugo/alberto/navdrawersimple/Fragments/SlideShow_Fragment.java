package hugo.alberto.navdrawersimple.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hugo.alberto.navdrawersimple.R;

/**
 * Created by Alberto on 29/05/2016.
 */
public class SlideShow_Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView;
        rootView = inflater.inflate(R.layout.slideshow_layout, container, false);
        return rootView;
    }
}