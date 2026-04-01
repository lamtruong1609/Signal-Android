package org.thoughtcrime.securesms.push;

import android.content.Context;

import org.thoughtcrime.securesms.R;
import org.whispersystems.signalservice.api.push.TrustStore;

import java.io.InputStream;

public class SelfhostedTrustStore implements TrustStore {

  private final Context context;

  public SelfhostedTrustStore(Context context) {
    this.context = context.getApplicationContext();
  }

  @Override
  public InputStream getKeyStoreInputStream() {
    return context.getResources().openRawResource(R.raw.selfhosted);
  }

  @Override
  public String getKeyStorePassword() {
    return "whisper";
  }
}
