xtest:
	jekyll
	recess --compile ./_less/custom-bootstrap.less > ./_site/css/bootstrap.css
	recess --compile ./_less/_bootstrap/responsive.less > ./_site/css/bootstrap-responsive.css

clean:
	rm -rf _site/*

bootstrap:
	wget -O latest_bootstrap.tar.gz https://github.com/twitter/bootstrap/tarball/master
	tar -xvzf latest_bootstrap.tar.gz
	cp -r twitter-bootstrap*/less* _less/_bootstrap
	rm latest_bootstrap.tar.gz
	rm -rf _bootstrap
	mv twitter-bootstrap* _bootstrap

GHPAGES=../../Xtest-gh-pages

gh-pages: xtest
	rm -rf ${GHPAGES}/*.html
	for f in img ico css js; \
	do \
		rm -rf ${GHPAGES}/$$f ; \
	done
	cp -r _site/* ${GHPAGES}/

watch:
	echo "Watching input files..."; \
	watchr -e "watch('^(?!_site)') { system 'make' }"
