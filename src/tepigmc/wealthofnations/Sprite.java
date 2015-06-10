package tepigmc.wealthofnations;

import java.net.MalformedURLException;
import java.net.URL;

public class Sprite {

  private URL url;

  /**
   * @param url the url to set
   */
  public Sprite(URL url) {
    setUrl(url);
  }

  /**
   * Creates a Sprite without throwing a MalformedURLException
   * @param url the url to set
   */
  public Sprite(String url) {
    try {
      setUrl(new URL(url));
    }
    catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }

  /**
   * @return the url
   */
  public URL getUrl() {
    return url;
  }

  /**
   * @param url the url to set
   */
  public void setUrl(URL url) {
    this.url = url;
  }

}
