package edu.nps.moves.dis7.entities.gbr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5e1dde44
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 14991
 */
public class TornadoFMk3 extends EntityType
{
    public TornadoFMk3()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 14987, Fighter/Air Defense
        setSubCategory((byte)1); // uid 14988, Tornado Air Defense Variant
        setSpecific((byte)3); // uid 14991, Tornado F. Mk 3
    }
}
