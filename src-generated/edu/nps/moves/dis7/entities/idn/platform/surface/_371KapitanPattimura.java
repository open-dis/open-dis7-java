package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2d96543c;
 * Country: Indonesia (IDN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30519
 */
public class _371KapitanPattimura extends EntityType
{
    /** Default constructor */
    public _371KapitanPattimura()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 28859, Frigate (including Corvette)
        setSubCategory((byte)4); // uid 30518, Kapitan Pattimura Class (Project 1331M)
        setSpecific((byte)1); // uid 30519, 371 Kapitan Pattimura
    }
}
