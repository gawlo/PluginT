
package android.MyCordovaPlugin;

public class MyCordovaPlugin extends CordovaPlugin{
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        log.d(TAG,"Initializing MyCordovaPlugin");
    }

public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException{
    if(acttion.equals("echo")) {
        String phrase = args.getString(0);
        log.d(TAG,phrase);
    } else if(action.equals("getDate")) {
        final PluginResult result = new PluginResult(PluginResult.Status.OK, (new Datee()).toString());
        callbackContext.sendPluginResult(result);
    }
    return true;
}
}


