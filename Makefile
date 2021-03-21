SRCDIR = src
BUILDDIR = build
PKGDIR = de/dhbw/kontakte
PKG = de.dhbw.kontakte
MAINCLASS = Kontakte
SOURCES = Kontakte.java Person.java
CLASSES := $(patsubst %.java, %.class, $(SOURCES))
SOURCEFILES := $(patsubst %.java, $(SRCDIR)/$(PKGDIR)/%.java, $(SOURCES))

run: all
	cd $(BUILDDIR) && java $(PKG).$(MAINCLASS)

all:
	javac -d $(BUILDDIR) $(SOURCEFILES)

clean:
	rm -rf $(BUILDDIR)
