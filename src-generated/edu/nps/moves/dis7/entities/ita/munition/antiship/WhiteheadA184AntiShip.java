package edu.nps.moves.dis7.entities.ita.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@b06d46d;
 * Country: Italy (ITA);
 * Entity kind: Munition;
 * Domain: ANTI_SHIP;
 *
 * Entity type uid: 31028
 */
public class WhiteheadA184AntiShip extends EntityType
{
    /** Default constructor */
    public WhiteheadA184AntiShip()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 21670, Guided
        setSubCategory((byte)6); // uid 31027, 533 mm Torpedo
        setSpecific((byte)1); // uid 31028, Whitehead A184 - Anti-Ship
    }
}
