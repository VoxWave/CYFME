package com.unknownpotato.cyfme.fileio;

import java.io.File;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.GdxRuntimeException;

public class ZipFileHandle extends FileHandle{
	
	private ZipFile archive;
	private ZipEntry archiveEntry;
	
	public ZipFileHandle(ZipFile archive, File file) {
		super(file, FileType.Classpath);	
		this.archive = archive;
		this.archiveEntry = this.archive.getEntry(file.getPath());
	}
	
	@Override
	public FileHandle child (String name) {
		name = name.replace('\\', '/');
		if (file.getPath().length() == 0) return new ZipFileHandle(archive, new File(name));
		return new ZipFileHandle(archive, new File(file, name));
	}
 
	@Override
	public FileHandle sibling (String name) {
		name = name.replace('\\', '/');
		if (file.getPath().length() == 0) throw new GdxRuntimeException("Cannot get the sibling of the root.");
		return new ZipFileHandle(archive, new File(file.getParent(), name));
	}
 
	@Override
	public FileHandle parent () {
		File parent = file.getParentFile();
		if (parent == null) {
			if (type == FileType.Absolute)
				parent = new File("/");
			else
				parent = new File("");
		}
		return new ZipFileHandle(archive, parent);
	}
	
	@Override
	public InputStream read () {
		try {
			return archive.getInputStream(archiveEntry);
		} catch (Exception e) {
			throw new GdxRuntimeException("File not found: " + file + " (Archive)");
		}
	}
	
	@Override
	public boolean exists() {
		return archiveEntry != null;		
	}
 
	@Override
	public long length () {
		return archiveEntry.getSize();
	}
 
	@Override
	public long lastModified () {
		return archiveEntry.getTime();
	}
}
