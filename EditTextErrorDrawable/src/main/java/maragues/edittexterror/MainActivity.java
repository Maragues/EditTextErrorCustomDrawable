package maragues.edittexterror;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    findViewById(R.id.hello_button).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        showValidationError();
      }
    });
  }

  @Override
  protected void onResume() {
    super.onResume();


  }

  private void showValidationError() {
    Drawable errorDrawable = getResources().getDrawable(R.drawable.ic_validated_wrong);
    errorDrawable.setBounds(0, 0, errorDrawable.getIntrinsicWidth(),
      errorDrawable.getIntrinsicHeight());

    ((EditText) findViewById(R.id.hello)).setError("Error popup", errorDrawable);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();
    if (id == R.id.action_settings) {
      return true;
    }
    return super.onOptionsItemSelected(item);
  }
}
