package com.xapp.naves.xapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MenuActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }

    /*@Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Truco trucoActual = (Truco)adaptador.getItem(position);
        String msg = "Elegiste la tarea:\n"+trucoActual.getNombre()+"-"+trucoActual.getId();
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();


        Intent intent = new Intent(MenuActivity.this, ViewVideoActivity.class);
        intent.putExtra("VideoId", trucoActual.getId()); //Your id
        startActivity(intent);

    }*/

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getSupportFragmentManager();

        Log.i("hernan", "position: " + position);
        String sportName = null;

        switch (position) {
            case 0:
                //bmx
                sportName = "bmx";
                break;
            case 1:
                //logboard
                sportName = "logboard";
                break;
            case 2:
                //skate
                sportName = "skate";
                break;
            case 3:
                //ski
                sportName = "ski";
                break;
            case 4:
                //snowboard
                sportName = "snowboard";
                break;
            case 5:
                //surf
                sportName = "surf";
                break;
        }

        //fragmentManager.findFragmentById()
        fragmentManager.beginTransaction()
                .replace(R.id.container, PlaceholderFragment.newInstance(position + 1, sportName)) //settea un nuevo fragment en el frameLayout container
                .commit();
    }

    public void onSectionAttached(int number) { //lo del case anterior termina llegando a este mismo case (si uso un solo fragment)
        Log.i("hernan", "number: " + number);
        switch (number) {
            case 1:
                mTitle = getString(R.string.bmx); //settea el titulo al activity
                //mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
                //setContentView(R.layout.activity_main);
                break;
            case 2:
                mTitle = getString(R.string.longboard);
                break;
            case 3:
                mTitle = getString(R.string.skate);
                break;
            case 4:
                mTitle = getString(R.string.ski);
                break;
            case 5:
                mTitle = getString(R.string.snowboard);
                break;
            case 6:
                mTitle = getString(R.string.surf);
                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.menu, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment { //CLASE QUE CAMBIA LOS FRAGMENTS
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";
        private static final String ARG_SPORT_NAME = "sport_name";
        private TextView textView;
        private ListView listView;
        private static String sport;
        ArrayAdapter adaptador;

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber, String sportName) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            args.putString(ARG_SPORT_NAME, sportName);
            sport = sportName;
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_menu, container, false);
            textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(sport);

            listView = (ListView) rootView.findViewById(R.id.list_fragment);
            adaptador = new TrucoArrayAdapter(getActivity(),DataSource.TAREAS); //le paso el activity y el array
            listView.setAdapter(adaptador); //se lo setteo al componente ListView

            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((MenuActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

    public void openList(View view) {
        Intent intent = new Intent(MenuActivity.this, ListActivity.class);
        startActivity(intent);
    }

}
