package testblockdecendants.mlevytskiy.com.testblocksdescendantsmultipleclickinlistview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by max on 12.08.15.
 */
public class ImplBaseAdapter extends BaseAdapter {

    private List<String> items = new ArrayList<>(Arrays.asList("1", "2", "3"));


    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = View.inflate(parent.getContext(), R.layout.item, null);
        ((TextView) view.findViewById(R.id.text_view)).setText(items.get(position));
        final Button ok = ((Button) view.findViewById(R.id.ok));
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "" + position, Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
