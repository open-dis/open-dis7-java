package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@327af41b;
 * Country: Germany (DEU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 16547
 */
public class Schutzeclasstype732diversupportship extends EntityType
{
    /** Default constructor */
    public Schutzeclasstype732diversupportship()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 16484, Mine Countermeasure Ship / Craft
        setSubCategory((byte)9); // uid 16547, Schutze class (type 732, diver-support ship)
    }
}
