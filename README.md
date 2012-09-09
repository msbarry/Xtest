[Xtest](http://msbarry.github.com/Xtest)
=====

Xtest is a scripting language tailored to testing Java code. It ships as an Eclipse plugin that lets you write .xtest files anywhere in your workspace in which test failures are highlighted just like Java compile errors.  

<a href="http://msbarry.github.com/Xtest"><img src="https://raw.github.com/msbarry/Xtest/master/website/img/maindemo_c.png"/></a>

See the [Xtest website](http://msbarry.github.com/Xtest) to get started.

Installation
------------
Xtest requires Eclipse SDK 3.6 or higher and can be installed from one of the following update sites:

`http://msbarry.github.com/Xtest/updates/release`<br>
`http://msbarry.github.com/Xtest/updates/develop`

Branches and Versions
---------------------

Xtest follows a modified version of the branching strategy described 
[here](http://nvie.com/posts/a-successful-git-branching-model/), except that 
development occurs in the 'master' branch and every commit to the 'release' 
branch is considered a new Xtest release.

Xtest releases follow the `major.minor.patch` version number format
- Releases bumping the major version number may break backwards compatibility of Xtest scripts written with a previous version.
- Releases bumping the minor version number will make additional functionality available or only affect the IDE without breaking backwards compatibility of Xtest scripts 
- Releases bumping the patch number will only fix bugs and not add or remove functionality.

Issues
------

Found a bug or have a suggestion? Create a GitHub issue here

https://github.com/msbarry/Xtest/issues

Acknowledgements
----------------
YourKit is kindly supporting open source projects with its full-featured Java Profiler.
YourKit, LLC is the creator of innovative and intelligent tools for profiling
Java and .NET applications. Take a look at YourKit's leading software products:
<a href="http://www.yourkit.com/java/profiler/index.jsp">YourKit Java Profiler</a> and
<a href="http://www.yourkit.com/.net/profiler/index.jsp">YourKit .NET Profiler</a>.

Copyright and license
---------------------
Copyright (c) 2012 Michael Barry

All rights reserved. This program and the accompanying materials 
are made available under the terms of the Eclipse Public License
v1.0 which accompanies this distribution, and is available at

http://www.eclipse.org/legal/epl-v10.html.