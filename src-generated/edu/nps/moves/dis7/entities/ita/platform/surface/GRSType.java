package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3b220bcb
 * Country: Italy (ITA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 18453
 */
public class GRSType extends EntityType
{
    public GRSType()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18374, Auxiliary
        setSubCategory((byte)14); // uid 18452, Harbor Tanker
        setSpecific((byte)1); // uid 18453, GRS Type
    }
}
