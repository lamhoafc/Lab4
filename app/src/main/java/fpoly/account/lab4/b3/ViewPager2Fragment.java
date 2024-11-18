package fpoly.account.lab4.b3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fpoly.account.lab4.R;
import fpoly.account.lab4.b1.Fragment1;
import fpoly.account.lab4.b1.Fragment2;


public class ViewPager2Fragment extends FragmentStateAdapter {

    public ViewPager2Fragment(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int
            position) {
        if (position == 0) {
            return new Fragment1();
        }
        return new Fragment2();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}