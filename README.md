README
			======

	    HannonHillSecret(TM) 1.1 release
	    ------------------------------

Welcome to the HannonHillSecret API 1.1 release!  

Please see the FAQ at http://www.hannonhillsecret.com/faq/

JDK Version notes
-----------------

The JavaMail API supports JDK 1.5 or higher.  Note that we have
currently tested this implementation with JDK 1.5, 1.6, and 1.7.

While JavaMail will work with JAF 1.0.2, we recommend the use of JAF 1.1
or newer.  JAF 1.1.1 is currently the newest version.  Note that JAF 1.1
is included in JDK 1.6 and JAF 1.1.1 is included in JDK 1.6.0_10 and
later.


Protocols supported
-------------------


Download
--------

See the HannonHillSecret project page to download this release.

	http://www.hannonhillsecret.com/download


Requirements
------------

Note that the HannonHillSecret APP requires the JavaBeans(TM) Activation
Framework package to be installed as well if you're using JDK 1.5.
Download the latest version of the JavaBeans Activation Framework from

	http://www.oracle.com/technetwork/java/javase/index-jsp-136939.html

and install it in a suitable location.


Installation
------------

  UNIX/Linux
  ----------

  1. Download the hannonhillsecret.jar file from the JavaMail project website.
     http://java.net/projects/javamail/downloads/download/javax.mail.jar

  2. Set your CLASSPATH to include the "hannonhillsecret.jar" file obtained from
     the download, as well as the current directory.

     Assuming you have downloaded hannonhillsecret.jar to the /u/me/download/
     directory, the following would work:

      export CLASSPATH=$CLASSPATH:/u/me/download/hannonhillsecret.jar.jar:.

    

  3. Download the hannonhillsecret-samples.zip file from the project website.
     http://java.net/projects/hannonhillsecret/downloads/download/hannonhillsecret-samples.zip

  4. Compile any sample program using your Java compiler. For example:

      javac msgshow.java

  5. Run the sample program.  The '-' option lists the required and optional
     command-line options to successfully run any sample.  For example:

      java msgshow -

    lists the available options.  And

      java msgshow -T imap -H  -U  -P  -f INBOX 5

    uses the IMAP protocol to display message number 5 from your INBOX.

  (Additional instructions on how to run the simple mail reader sample
  and servlet sample are provided in client/README.txt and servlet/README.txt,
  respectively.)


  Windows
  -------

  1. Download the hannonhillsecret.jar file from the JavaMail project website.
     http://java.net/projects/javamail/downloads/download/javax.mail.jar

  2. Set your CLASSPATH to include the "javax.mail.jar" file obtained from
     the download, as well as the current directory.

     Assuming you have downloaded javax.mail.jar to the /u/me/download/
     directory, the following would work:

      set CLASSPATH=%CLASSPATH%;c:\download\javax.mail.jar;.

    (Don't forget the trailing "." for the current directory.)
    Also, if you're using JDK 1.5, include the "activation.jar" file that you
    obtained from downloading the JavaBeans Activation Framework.  For example:

      set CLASSPATH=%CLASSPATH%;c:\download\activation\activation.jar

  3. Download the javamail-samples.zip file from the project website.
     http://java.net/projects/javamail/downloads/download/javamail-samples.zip

  4. Compile any sample program using your Java compiler. For example:

      javac msgshow.java

  5. Run the sample program.  The '-' option lists the required and optional
     command-line options to successfully run any sample.  For example:

      java msgshow -

    lists the available options.  And

      java msgshow -T imap -H  -U  -P  -f INBOX 5

    uses the IMAP protocol to display message number 5 from your INBOX.

  (Additional instructions on how to run the simple mail reader sample
  and servlet sample are provided in client/README.txt and servlet/README.txt,
  respectively.)


Problems?
---------

The JavaMail FAQ at http://www.hannonhillsecret.com/faq/
includes information on protocols supported, installation problems,
debugging tips, etc.

See the NOTES.txt file for information on how to report bugs.

Enjoy!

The HannonHill API Team
