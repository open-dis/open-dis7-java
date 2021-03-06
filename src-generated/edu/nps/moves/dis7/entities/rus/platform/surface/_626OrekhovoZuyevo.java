package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3047254d;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 32932
 */
public class _626OrekhovoZuyevo extends EntityType
{
    /** Default constructor */
    public _626OrekhovoZuyevo()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 13593, Guided-missile Frigate (includes Corvette)
        setSubCategory((byte)16); // uid 32925, Buyan-M Class (Project 21631)
        setSpecific((byte)7); // uid 32932, 626 Orekhovo-Zuyevo
    }
}
