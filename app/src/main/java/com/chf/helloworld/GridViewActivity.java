package com.chf.helloworld;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class GridViewActivity extends Activity {

    private List<Country> countries;
    private GridView countriesGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);

        countriesGridView = (GridView) findViewById(R.id.countries);

        countries = getCountries();
        countriesGridView.setAdapter(new CountryAdapter(this, R.layout.country, countries));

    }

    private List<Country> getCountries() {
        List<Country> countries = new ArrayList<Country>();

        countries.add(new Country("afghanistan", R.drawable.afghanistan));
        countries.add(new Country("albania", R.drawable.albania));
        countries.add(new Country("algeria", R.drawable.algeria));
        countries.add(new Country("andorra", R.drawable.andorra));
        countries.add(new Country("angola", R.drawable.angola));
        countries.add(new Country("anguilla", R.drawable.anguilla));
        countries.add(new Country("antarctica", R.drawable.antarctica));
        countries.add(new Country("argentina", R.drawable.argentina));
        countries.add(new Country("armenia", R.drawable.armenia));
        countries.add(new Country("aruba", R.drawable.aruba));
        countries.add(new Country("australia", R.drawable.australia));
        countries.add(new Country("austria", R.drawable.austria));
        countries.add(new Country("azerbaijan", R.drawable.azerbaijan));
        countries.add(new Country("bahamas", R.drawable.bahamas));
        countries.add(new Country("bahrain", R.drawable.bahrain));
        countries.add(new Country("bangladesh", R.drawable.bangladesh));
        countries.add(new Country("barbados", R.drawable.barbados));
        countries.add(new Country("belarus", R.drawable.belarus));
        countries.add(new Country("belgium", R.drawable.belgium));
        countries.add(new Country("belize", R.drawable.belize));
        countries.add(new Country("benin", R.drawable.benin));
        countries.add(new Country("bermuda", R.drawable.bermuda));
        countries.add(new Country("bhutan", R.drawable.bhutan));
        countries.add(new Country("bolivia", R.drawable.bolivia));
        countries.add(new Country("botswana", R.drawable.botswana));
        countries.add(new Country("brazil", R.drawable.brazil));
        countries.add(new Country("brunei", R.drawable.brunei));
        countries.add(new Country("bulgaria", R.drawable.bulgaria));
        countries.add(new Country("burundi", R.drawable.burundi));
        countries.add(new Country("cambodja", R.drawable.cambodja));
        countries.add(new Country("cameroon", R.drawable.cameroon));
        countries.add(new Country("canada", R.drawable.canada));
        countries.add(new Country("chad", R.drawable.chad));
        countries.add(new Country("chile", R.drawable.chile));
        countries.add(new Country("china", R.drawable.china));
        countries.add(new Country("cis", R.drawable.cis));
        countries.add(new Country("colombia", R.drawable.colombia));
        countries.add(new Country("commonwealth", R.drawable.commonwealth));
        countries.add(new Country("comoros", R.drawable.comoros));
        countries.add(new Country("croatia", R.drawable.croatia));
        countries.add(new Country("cuba", R.drawable.cuba));
        countries.add(new Country("cyprus", R.drawable.cyprus));
        countries.add(new Country("denmark", R.drawable.denmark));
        countries.add(new Country("djibouti", R.drawable.djibouti));
        countries.add(new Country("dominica", R.drawable.dominica));
        countries.add(new Country("dominican republic", R.drawable.dominican_republic));
        countries.add(new Country("east timor", R.drawable.east_timor));
        countries.add(new Country("ecuador", R.drawable.ecuador));
        countries.add(new Country("egypt", R.drawable.egypt));
        countries.add(new Country("elsalvador", R.drawable.elsalvador));
        countries.add(new Country("england", R.drawable.england));
        countries.add(new Country("eritrea", R.drawable.eritrea));
        countries.add(new Country("equatorial guinea", R.drawable.equatorial_guinea));
        countries.add(new Country("estonia", R.drawable.estonia));
        countries.add(new Country("ethiopia", R.drawable.ethiopia));
        countries.add(new Country("eu", R.drawable.eu));
        countries.add(new Country("faroes", R.drawable.faroes));
        countries.add(new Country("fiji", R.drawable.fiji));
        countries.add(new Country("finland", R.drawable.finland));
        countries.add(new Country("france", R.drawable.france));
        countries.add(new Country("gabon", R.drawable.gabon));
        countries.add(new Country("gambia", R.drawable.gambia));
        countries.add(new Country("georgia", R.drawable.georgia));
        countries.add(new Country("ghana", R.drawable.ghana));
        countries.add(new Country("gibraltar", R.drawable.gibraltar));
        countries.add(new Country("greece", R.drawable.greece));
        countries.add(new Country("grenada", R.drawable.grenada));
        countries.add(new Country("guam", R.drawable.guam));
        countries.add(new Country("guatemala", R.drawable.guatemala));
        countries.add(new Country("guinea", R.drawable.guinea));
        countries.add(new Country("guyana", R.drawable.guyana));

        return countries;
    }

    private class CountryAdapter extends ArrayAdapter<Country> {

        private LayoutInflater layoutInflater;
        private Resources resources;

        public CountryAdapter(Context context, int resource, List<Country> countries) {
            super(context, resource, countries);
            layoutInflater = LayoutInflater.from(context);
            resources = getResources();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView countryTextView = (TextView) convertView;

            if (convertView == null) {
                countryTextView = (TextView) layoutInflater.inflate(R.layout.country, null);
            }

            Country country = getItem(position);
            countryTextView.setText(country.getName());
            countryTextView.setCompoundDrawablesWithIntrinsicBounds(null,
                    resources.getDrawable(country.getFlagResId()), null, null);

            return countryTextView;
        }
    }
}
