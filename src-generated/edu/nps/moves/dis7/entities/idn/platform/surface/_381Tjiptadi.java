package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5669c5fb
 * Country: Indonesia (IDN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 30528
 */
public class _381Tjiptadi extends EntityType
{
    public _381Tjiptadi()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 28859, Frigate (including Corvette)
        setSubCategory((byte)4); // uid 30518, Kapitan Pattimura Class (Project 1331M)
        setSpecific((byte)10); // uid 30528, 381 Tjiptadi
    }
}