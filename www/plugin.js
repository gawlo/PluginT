var exec = require('cordova/exec');
var PLUGIN_NAME = 'MyCordovaPlugin';
var DEVICE = {
    echo: function(phrase, cb){
        exec(cb, null, PLUGIN_NAME, 'echo', {phrase});
    },
    getDate: function(cb) {
        exec(cb, null, PLUGIN_NAME, 'getDate', []);
    }
};
module.exports = MyCordovaPlugin;
