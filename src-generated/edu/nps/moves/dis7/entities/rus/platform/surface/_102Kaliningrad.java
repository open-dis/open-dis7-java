package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4c4f4365;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27079
 */
public class _102Kaliningrad extends EntityType
{
    /** Default constructor */
    public _102Kaliningrad()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 13758, Tank landing ship
        setSubCategory((byte)1); // uid 13759, Ropucha Class (Project 775)
        setSpecific((byte)12); // uid 27079, 102 Kaliningrad
    }
}
