module fhnw.ip {
    // Module Exports
    exports ip12;
    exports ip12.DemoApp;
    exports ip12.Pong;

    //Processing
    requires core;

    // Pi4J MODULES
    requires com.pi4j;
    requires com.pi4j.library.pigpio;
    requires com.pi4j.plugin.pigpio;
    requires com.pi4j.plugin.raspberrypi;
    requires com.pi4j.plugin.mock;
    requires com.pi4j.plugin.linuxfs;

    uses com.pi4j.extension.Extension;
    uses com.pi4j.provider.Provider;

    requires java.logging;
}
