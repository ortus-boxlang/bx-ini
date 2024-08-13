# ⚡︎ BoxLang INI File Helper

```
|:------------------------------------------------------:|
| ⚡︎ B o x L a n g ⚡︎
| Dynamic : Modular : Productive
|:------------------------------------------------------:|
```

<blockquote>
	Copyright Since 2023 by Ortus Solutions, Corp
	<br>
	<a href="https://www.boxlang.io">www.boxlang.io</a> |
	<a href="https://www.ortussolutions.com">www.ortussolutions.com</a>
</blockquote>

<p>&nbsp;</p>

## Welcome to the BoxLang INI File Helper Module

This module allows you to read and write INI files in a very easy way.

```ini
[General]
appName=MyApplication
version=1.2.3
author=John Doe
boxlang=rocks

[Database]
host=localhost
port=5432
username=dbuser
password=dbpass
dbname=mydatabase

[Logging]
logLevel=DEBUG
logFile=/var/log/myapp.log
maxFileSize=10MB

[Features]
enableFeatureX=true
enableFeatureY=false
maxConnections=100
```

## Contributed Functions

Here are the contributed functions in this module:

* `getIniFile( file )` : Reads an ini file and returns the IniFile object. If the file does not exist, it will create it.
* `getProfileSection( iniFile, section )` : Gets a section from the ini file as a struct
* `getProfileSections( iniFile )` : Gets all the sections from the ini file as a struct of structs
* `getProfileString( iniFile, section, entry )` : Gets an entry from a section in the ini file, if it does not exist, it will return an empty string
* `setProfileString( iniFile, section, entry, value )` : Sets an entry in a section in the ini file, if the section does not exist, it will create it
* `removeProfileSection( iniFile, section )` : Removes a section from the ini file
* `removeProfileString( iniFile, section, entry )` : Removes an entry from a section in the ini file

The `IniFile` object is a fluent object that allows you to work with ini files in a very easy way.  Here is an example of how to use it:

```java

// Get the ini file
var iniFile = getIniFile( "test.ini" );
iniFile.createSection( "mySettings" );
// Set a string
iniFile.setEntry( "section1", "entry1", "value1" );
// Get a string
var value = iniFile.getEntry( "section1", "entry1" );
// Remove a string
iniFile.removeEntry( "section1", "entry1" );
// Remove a section
iniFile.removeSection( "section1" );
```

## Ortus Sponsors

BoxLang is a professional open-source project and it is completely funded by the [community](https://patreon.com/ortussolutions) and [Ortus Solutions, Corp](https://www.ortussolutions.com).  Ortus Patreons get many benefits like a cfcasts account, a FORGEBOX Pro account and so much more.  If you are interested in becoming a sponsor, please visit our patronage page: [https://patreon.com/ortussolutions](https://patreon.com/ortussolutions)

### THE DAILY BREAD

 > "I am the way, and the truth, and the life; no one comes to the Father, but by me (JESUS)" Jn 14:1-12
