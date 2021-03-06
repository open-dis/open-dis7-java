package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@31464a43;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 13795
 */
public class Muraveyclassfastattackcraftpatrolhydrofoil extends EntityType
{
    /** Default constructor */
    public Muraveyclassfastattackcraftpatrolhydrofoil()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)14); // uid 13785, Hydrofoil
        setSubCategory((byte)10); // uid 13795, Muravey class (fast attack craft, patrol hydrofoil)
    }
}
