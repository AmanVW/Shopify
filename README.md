# Shopify Repo

## Creating and checking out repository in GitHub

- Once you have created repository using github UI, click on the 'Code' link and copy the clone uri.
- Open terminal and navigate to home/username/git
- Check if all the git configurations are correct using _git config --list_ command.
- If you want to update any of the entries use _git config --global <entry name> <value>_
- If you want to delete any of the entries, use _git congit --global --unset <entry name>_
- _git clone <clone uri>_
- To Commit the code use following commands:
	- _git status_ => To check the tracked/untracked files
	- _git add ._ => To add all the files in local git repo
	- _git commit -m '<commit message>'_ => To commit the code in remote git
	- _git push_ => To push the code in remote git
	- _git branch_ => Check all the branch of current repo
	- _git branch -b <branch name>_ => create new branch
	- _git checkout <branch name>_ => checkout different branch
	
