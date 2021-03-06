package edu.nps.moves.dis7.entities.oth.supply.class7majoritems;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@17003497;
 * Country: Other;
 * Entity kind: Supply;
 * Domain: CLASS_7_MAJOR_ITEMS;
 *
 * Entity type uid: 30794
 */
public class LAU61DA extends EntityType
{
    /** Default constructor */
    public LAU61DA()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_7_MAJOR_ITEMS));

        setCategory((byte)30); // uid 30783, Rocket Pod/Launcher
        setSubCategory((byte)4); // uid 30789, LAU-61
        setSpecific((byte)5); // uid 30794, LAU-61D/A
    }
}
