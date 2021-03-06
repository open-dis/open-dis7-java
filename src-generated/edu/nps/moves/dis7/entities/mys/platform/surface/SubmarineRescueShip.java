package edu.nps.moves.dis7.entities.mys.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5db99216;
 * Country: Malaysia (MYS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30533
 */
public class SubmarineRescueShip extends EntityType
{
    /** Default constructor */
    public SubmarineRescueShip()
    {
        setCountry(Country.MALAYSIA_MYS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 27403, Auxiliary
        setSubCategory((byte)2); // uid 30533, Submarine Rescue Ship
    }
}
