package edu.nps.moves.dis7.entities.lbr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@24f360b2;
 * Country: Liberia (LBR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24532
 */
public class Kuban extends EntityType
{
    /** Default constructor */
    public Kuban()
    {
        setCountry(Country.LIBERIA_LBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24523, Tanker (Group 3 Merchant)
        setSubCategory((byte)3); // uid 24529, Liquid Natural Gas (LNG) Tanker
        setSpecific((byte)3); // uid 24532, Kuban
    }
}
