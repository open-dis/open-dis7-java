package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@10ded6a9
 * Country: Indonesia (IDN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 30522
 */
public class _374LambungMangkurat extends EntityType
{
    public _374LambungMangkurat()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 28859, Frigate (including Corvette)
        setSubCategory((byte)4); // uid 30518, Kapitan Pattimura Class (Project 1331M)
        setSpecific((byte)4); // uid 30522, 374 Lambung Mangkurat
    }
}
