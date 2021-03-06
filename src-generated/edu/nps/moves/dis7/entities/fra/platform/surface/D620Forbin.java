package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@38cee291;
 * Country: France (FRA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 22712
 */
public class D620Forbin extends EntityType
{
    /** Default constructor */
    public D620Forbin()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 15929, Guided Missile Destroyer (Fregates or Escorteurs Descadres)
        setSubCategory((byte)6); // uid 22711, Forbin (Horizon) Class
        setSpecific((byte)1); // uid 22712, D620 Forbin
    }
}
