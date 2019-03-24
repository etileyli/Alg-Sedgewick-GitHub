### Exapmles In Algorithms book of Sedgewick
Repo for exercises in the book.

##### 1- Error: Unable to commit. Please let me know who you are.
The first time I tried to commit a file in Atom-Git panel, Atom gives the error "Unable to commit. Please let me know who you are." message.
In order to commit, I open cmd in the project folder and run:
* git init
* git config user.name "etileyli"
* git config user.email "etileyli@hotmail.com"
* git add *
* git commit -m "some init msg"

After that, I started to commit from Atom as well.

##### 2- Error:  The tip of your current branch is behind its remote counterpart. Try pulling before pushing.

After that, when I tried to push the changed file to GitHub I got the error:

The tip of your current branch is behind its remote counterpart. Try pulling before pushing.
To force push, hold cmd or ctrl while clicking.

to resolve this problem I open terminal in local repository and enter:

git push -u origin master
Username for 'https://github.com': etileyli
Password for 'https://etileyli@github.com':

Bash gave the following error:

* Counting objects: 9, done.
* Delta compression using up to 2 threads.
* Compressing objects: 100% (5/5), done.
* Writing objects: 100% (9/9), 771 bytes | 385.00 KiB/s, done.
* Total 9 (delta 1), reused 0 (delta 0)
* remote: Resolving deltas: 100% (1/1), done.
* remote: error: GH007: Your push would publish a private email address.
* remote: You can make your email public or disable this protection by visiting:
* remote: http://github.com/settings/emails
* To https://github.com/etileyli/Alg-Sedgewick.git
*  ! [remote rejected] master -> master (push declined due to email privacy restrictions)

In GitHub I uncheck 'Keep my email address private' and the problem resolved.
