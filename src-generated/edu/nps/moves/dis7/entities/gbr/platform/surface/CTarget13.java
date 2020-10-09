package edu.nps.moves.dis7.entities.gbr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@134ff8f8
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 29944
 */
public class CTarget13 extends EntityType
{
    public CTarget13()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)19); // uid 29939, Unmanned Surface Vehicle (USV)
        setSubCategory((byte)1); // uid 29940, Remote Controlled Surface Target
        setSpecific((byte)4); // uid 29944, C-Target 13
    }
}
