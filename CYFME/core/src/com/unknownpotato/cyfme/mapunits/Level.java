package com.unknownpotato.cyfme.mapunits;

import java.util.Collection;

import com.badlogic.gdx.graphics.Texture;

/**
 * Määritellään, että level koostuu metadatasta, entityistä ja yhdestä taustakuvasta.
 * 
 * Määritellään alustavasti myös, että level talletetaan pakattuun tiedostoon seuraavalla tavalla:
 * 
 *-tasonnimi.zip
 * |
 * |- entities.json (sisältää tiedot entityjen deserialisoimiseksi)
 * |- metadata.json (sisältää tiedot metadatan deserialisoimiseksi)
 * |- background.png (sisältää taustan)
 * 
 * 
 * @author kumikumi
 *
 */
public class Level {

	private Texture background;
	private Collection<DataObject> entities;
	private Metadata metadata;
	
	public Texture getBackground() {
		return background;
	}
	public void setBackground(Texture background) {
		this.background = background;
	}
	public Collection<DataObject> getEntities() {
		return entities;
	}
	public void setEntities(Collection<DataObject> entities) {
		this.entities = entities;
	}
	public Metadata getMetadata() {
		return metadata;
	}
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
	
	
	
}
