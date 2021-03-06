package edu.nps.moves.dis7.entities.ukr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2a4f5433;
 * Country: Ukraine (UKR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27850
 */
public class U205Lutsk extends EntityType
{
    /** Default constructor */
    public U205Lutsk()
    {
        setCountry(Country.UKRAINE_UKR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 27845, Frigate (including Corvette)
        setSubCategory((byte)2); // uid 27849, Grisha V Class
        setSpecific((byte)1); // uid 27850, U-205 Lutsk
    }
}
