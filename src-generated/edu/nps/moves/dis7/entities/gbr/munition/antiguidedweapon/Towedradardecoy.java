package edu.nps.moves.dis7.entities.gbr.munition.antiguidedweapon;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@762bf32d;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Munition;
 * Domain: ANTI_GUIDED_WEAPON;
 *
 * Entity type uid: 20992
 */
public class Towedradardecoy extends EntityType
{
    /** Default constructor */
    public Towedradardecoy()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_GUIDED_WEAPON));

        setCategory((byte)1); // uid 20990, Guided
        setSubCategory((byte)1); // uid 20991, Decoys
        setSpecific((byte)1); // uid 20992, Towed radar decoy
    }
}
