package edu.nps.moves.dis7.entities.nor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@39c11e6c;
 * Country: Norway (NOR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24611
 */
public class Solviken extends EntityType
{
    /** Default constructor */
    public Solviken()
    {
        setCountry(Country.NORWAY_NOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24609, Tanker (Group 3 Merchant)
        setSubCategory((byte)1); // uid 24610, Liquid Petroleum Gas (LPG)Tanker
        setSpecific((byte)1); // uid 24611, Solviken
    }
}
